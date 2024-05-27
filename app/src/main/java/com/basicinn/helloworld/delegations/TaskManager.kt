package com.basicinn.helloworld.delegations

//Use of Delegations
class TaskManager(val creator: Task, val executor: ExecuteTask)
    : Task by creator, ExecuteTask by executor/*{
    override fun Execute() {
        executor.Execute()
    }

    override fun Create() {
        creator.Create()
    }
}*/