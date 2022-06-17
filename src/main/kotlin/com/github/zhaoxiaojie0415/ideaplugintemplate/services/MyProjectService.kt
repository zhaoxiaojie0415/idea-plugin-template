package com.github.zhaoxiaojie0415.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.zhaoxiaojie0415.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
