package com.github.shiraji.ooh

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class OohAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Notifications.Bus.notify(
            Notification(
            "Ooh",
            "おおおおお。すごいですね",
                "",
            NotificationType.INFORMATION)
        )
    }
}