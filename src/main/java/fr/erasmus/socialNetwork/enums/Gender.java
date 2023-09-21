package fr.erasmus.socialNetwork.enums;

import java.util.Arrays;

public enum Gender {
	MAN, WOMAN, NON_SPECIFIED;

	public static Gender getOrNull(String string) {
		return Arrays.asList(Gender.values()).stream().filter(gender -> gender.name().equals(string)).findAny()
				.orElse(NON_SPECIFIED);
	}
}
