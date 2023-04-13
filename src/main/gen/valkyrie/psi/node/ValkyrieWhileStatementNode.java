// This is a generated file. Not intended for manual editing.
package valkyrie.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static valkyrie.psi.ValkyrieTypes.*;
import valkyrie.psi.ValkyrieElement;

public class ValkyrieWhileStatementNode extends ValkyrieElement implements ValkyrieWhileStatement {

    public ValkyrieWhileStatementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ValkyrieVisitor visitor) {
        visitor.visitWhileStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public ValkyrieBlockBody getBlockBody() {
        return findChildByClass(ValkyrieBlockBody.class);
    }

    @Override
    @Nullable
    public ValkyrieInlineExpression getInlineExpression() {
        return findChildByClass(ValkyrieInlineExpression.class);
    }

    @Override
    @Nullable
    public ValkyrieOtherwiseStatement getOtherwiseStatement() {
        return findChildByClass(ValkyrieOtherwiseStatement.class);
    }

}
