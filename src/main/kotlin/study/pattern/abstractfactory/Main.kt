package study.pattern.abstractfactory

fun main() {
    val mazeGame = MazeGame(EnchantedMazeGameFactory())
    val maze = mazeGame.create()
}