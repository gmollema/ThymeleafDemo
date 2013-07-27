package demo.model;

public enum Genre {

	ACTION("ACTION"),
    ADVENTURE("ADVENTURE"),
	ANIMATION("ANIMATION"),
	DRAMA("DRAMA"),
	FANTASY("FANTASY");

	public static final Genre[] ALL = { ACTION, ANIMATION, DRAMA, FANTASY };
	private final String name;

	public static Genre forName(final String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null for Genre");
		}
		if (name.toUpperCase().equals("ACTION")) {
			return ACTION;
        } else if (name.toUpperCase().equals("ADVENTURE")) {
            return ADVENTURE;
		} else if (name.toUpperCase().equals("ANIMATION")) {
			return ANIMATION;
		} else if (name.toUpperCase().equals("DRAMA")) {
			return DRAMA;
		} else if (name.toUpperCase().equals("FANTASY")) {
			return FANTASY;
		}
		throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Genre");
	}


	private Genre(final String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return getName();
	}

}
