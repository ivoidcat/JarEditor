package com.liubs.jareditor.action;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @author Liubsyy
 * @date 2024/5/12
 */
public class JarEditorAddResourceFile  extends JavaEditorAddFile {
    @Override
    protected String preInput(Project project, String entryPathFromJar) {
        String userInput = Messages.showInputDialog(
                project,
                "Enter name for new file:",
                "Create New File",
                Messages.getQuestionIcon()
        );
        return entryPathFromJar+"/"+userInput;
    }
}