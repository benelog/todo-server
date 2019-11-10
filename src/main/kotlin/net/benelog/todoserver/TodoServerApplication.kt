package net.benelog.todoserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoServerApplication

// testj
fun main(args: Array<String>) {
    runApplication<TodoServerApplication>(*args)
}
