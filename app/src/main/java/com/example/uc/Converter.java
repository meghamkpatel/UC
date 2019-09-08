package com.example.uc;

public class Converter {
    public enum Unit {
        INCH("Inch"),
        SHAQUILLE("Shaquille"),
        TONGUE("Human Tongue"),
        INTESTINE("Small Intestine"),
        COCKROACH("Cockroach"),
        MACHUPICCHU("Machu Picchu"),
        COLLOSSEUM("Collosseum"),
        MARATHON("Marathon"),
        TREX("T-Rex");

        private String displayName;
        Unit(String displayName) {
                this.displayName = displayName;
        }
        @Override
        public String toString() { return this.displayName; }

        // Helper method to convert text to one of the above constants
        public static Unit fromString(String text) {
            if (text != null) {
                for (Unit unit : Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }

            }


            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;

    public Converter(Unit from, Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case INCH:
                if (to == Unit.MACHUPICCHU) {
                    constant = 165312;
                } else if (to == Unit.COLLOSSEUM) {
                    constant = 21456;
                } else if (to == Unit.MARATHON) {
                    constant = 1660032;
                } else if (to == Unit.TREX) {
                    constant = 472.4409;
                }
                break;
            case SHAQUILLE:
                if (to == Unit.MACHUPICCHU) {
                    constant = 1944.84705882;
                } else if (to == Unit.COLLOSSEUM) {
                    constant = 252.423529412;
                } else if (to == Unit.MARATHON) {
                    constant = 19529.78824;
                } else if (to == Unit.TREX) {
                    constant = 5.558128235;
                }
                break;
            case TONGUE:
                if (to == Unit.MACHUPICCHU) {
                    constant = 41328;
                } else if (to == Unit.COLLOSSEUM) {
                    constant = 5364;
                } else if (to == Unit.MARATHON) {
                    constant = 415008;
                } else if (to == Unit.TREX) {
                    constant = 118.110225;
                }
                break;
            case INTESTINE:
                if (to == Unit.MACHUPICCHU) {
                    constant = 706.461538462;
                } else if (to == Unit.COLLOSSEUM) {
                    constant = 91.6923076923;
                } else if (to == Unit.MARATHON) {
                    constant = 7094.15384615;
                } else if (to == Unit.TREX) {
                    constant = 2.01897820513;
                }
                break;
            case COCKROACH:
                if (to == Unit.MACHUPICCHU) {
                    constant = 139964.439929;
                } else if (to == Unit.COLLOSSEUM) {
                    constant = 18166.1163322;
                } else if (to == Unit.MARATHON) {
                    constant = 1405496.57099;
                } else if (to == Unit.TREX) {
                    constant = 400.000762002;
                }
                break;
        }

        multiplier = constant;
    }

    // Convert the unit!
    public double convert() {

        return multiplier;
    }
}
