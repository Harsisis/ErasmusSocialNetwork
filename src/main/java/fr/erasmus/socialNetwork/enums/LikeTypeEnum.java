package fr.erasmus.socialNetwork.enums;

import java.util.Arrays;

public enum LikeTypeEnum {
	LIKE, LOVE, BRAVO, WOAW;

	public static LikeTypeEnum getOrNull(String string) {
		return Arrays.asList(LikeTypeEnum.values()).stream().filter(gender -> gender.name().equals(string)).findAny()
				.orElse(LIKE);
	}
}
