package study.pattern.factorymethod

fun main() {
    val mazeGame: MazeGame = EnchantedMazeGame()
    val maze = mazeGame.create()
}