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

public class ValkyrieDeclareVariableNode extends ValkyrieElement implements ValkyrieDeclareVariable {

    public ValkyrieDeclareVariableNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ValkyrieVisitor visitor) {
        visitor.visitDeclareVariable(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public ValkyrieExpression getExpression() {
        return findChildByClass(ValkyrieExpression.class);
    }

    @Override
    @Nullable
    public ValkyrieForStatement getForStatement() {
        return findChildByClass(ValkyrieForStatement.class);
    }

    @Override
    @Nullable
    public ValkyrieIfCaseStatement getIfCaseStatement() {
        return findChildByClass(ValkyrieIfCaseStatement.class);
    }

    @Override
    @Nullable
    public ValkyrieIfStatement getIfStatement() {
        return findChildByClass(ValkyrieIfStatement.class);
    }

    @Override
    @Nullable
    public ValkyrieMatchStatement getMatchStatement() {
        return findChildByClass(ValkyrieMatchStatement.class);
    }

    @Override
    @Nullable
    public ValkyrieNewLambda getNewLambda() {
        return findChildByClass(ValkyrieNewLambda.class);
    }

    @Override
    @Nullable
    public ValkyrieNewObject getNewObject() {
        return findChildByClass(ValkyrieNewObject.class);
    }

    @Override
    @Nullable
    public ValkyrieNewValue getNewValue() {
        return findChildByClass(ValkyrieNewValue.class);
    }

    @Override
    @Nullable
    public ValkyriePatternBare getPatternBare() {
        return findChildByClass(ValkyriePatternBare.class);
    }

    @Override
    @Nullable
    public ValkyrieTryStatement getTryStatement() {
        return findChildByClass(ValkyrieTryStatement.class);
    }

    @Override
    @Nullable
    public ValkyrieTypeHint getTypeHint() {
        return findChildByClass(ValkyrieTypeHint.class);
    }

    @Override
    @Nullable
    public ValkyrieWhileStatement getWhileStatement() {
        return findChildByClass(ValkyrieWhileStatement.class);
    }

}