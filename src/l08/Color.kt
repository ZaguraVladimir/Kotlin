package l08

enum class Color(val colorHex: String, val opacity: Int = 1) {
    WHITE("#FFFFFF", 1), BLACK("#000000"), RED("#FF0000", 0), GREEN("#00FF00")
}