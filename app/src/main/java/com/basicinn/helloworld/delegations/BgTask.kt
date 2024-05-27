package com.basicinn.helloworld.delegations

class BgTask(val taskName: String): Task {
    override fun Create() {
        println("Task: $taskName Created")
    }
}