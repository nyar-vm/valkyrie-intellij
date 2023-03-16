//package valkyrie.lsp
//
//import com.intellij.openapi.project.Project
//import com.intellij.openapi.vfs.VirtualFile
//import com.intellij.platform.lsp.api.LspServerSupportProvider
//import valkyrie.language.file.ValkyrieFileType
//
//@Suppress("UnstableApiUsage")
//class ValkyrieLanguageProtocol : LspServerSupportProvider {
//    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
//        if (file.fileType != ValkyrieFileType) return
//
////        val node = NodeJsInterpreterManager.getInstance(project).interpreter
////        if (node !is NodeJsLocalInterpreter && node !is WslNodeInterpreter) return
//
//        serverStarter.ensureServerStarted(ValkyrieLanguageServer(project))
//    }
//}