package J13_ENUM;

enum Colors {
    RED("FF0000"),
    GREEN("61FF33"),
    BLUE("3377FF"),
    YELLOW("4477FF");

    private String hexCode;

    Colors(String hexCode_c) {
        this.hexCode = hexCode_c;
    }

    String getHexCode() {
        return this.hexCode;
    }

}