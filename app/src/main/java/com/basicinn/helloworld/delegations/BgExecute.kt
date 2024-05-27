package com.basicinn.helloworld.delegations

class BgExecute(val taskName: String): ExecuteTask {
    override fun Execute() {
        println("Task: $taskName is Executing...")
    }
}