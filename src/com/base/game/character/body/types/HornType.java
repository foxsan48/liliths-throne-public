package com.base.game.character.body.types;

import com.base.game.character.GameCharacter;
import com.base.game.character.race.Race;
import com.base.game.dialogue.utils.UtilText;

/**
 * @since 0.1.0
 * @version 0.1.85
 * @author Innoxia
 */
public enum HornType implements BodyPartTypeInterface {
	NONE("", null, null),

	DEMON_COMMON_FEMALE("long, swept-back", BodyCoveringType.HORN_DEMON, Race.DEMON),

	DEMON_COMMON_MALE("short, curved", BodyCoveringType.HORN_DEMON, Race.DEMON),

	BOVINE_FEMALE("short, curved", BodyCoveringType.HORN_COW, Race.COW_MORPH),

	BOVINE_MALE("long, curved", BodyCoveringType.HORN_COW, Race.COW_MORPH);

	private BodyCoveringType skinType;
	private Race race;
	
	private HornType(String descriptor, BodyCoveringType skinType, Race race) {
		this.skinType = skinType;
		this.race = race;
	}

	@Override
	public String getDeterminer(GameCharacter gc) {
		return "a pair of";
	}

	@Override
	public boolean isDefaultPlural() {
		return true;
	}
	
	@Override
	public String getNameSingular(GameCharacter gc) {
		switch(this){
			default:
				return UtilText.returnStringAtRandom("horn");
		}
	}
	
	@Override
	public String getNamePlural(GameCharacter gc) {
		switch(this){
			default:
				return UtilText.returnStringAtRandom("horns");
		}
	}

	@Override
	public String getDescriptor(GameCharacter gc) {
		switch(this){
			case DEMON_COMMON_FEMALE:
				return UtilText.returnStringAtRandom("long", "swept-back", "sleek");
			case DEMON_COMMON_MALE:
				return UtilText.returnStringAtRandom("short", "swept-back");
			case BOVINE_FEMALE:
				return UtilText.returnStringAtRandom("short", "sleek");
			case BOVINE_MALE:
				return UtilText.returnStringAtRandom("long");
			case NONE:
				return UtilText.returnStringAtRandom("");
			default:
				return UtilText.returnStringAtRandom("");
		}
	}

	@Override
	public BodyCoveringType getBodyCoveringType() {
		return skinType;
	}

	@Override
	public Race getRace() {
		return race;
	}
}
