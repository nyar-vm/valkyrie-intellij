// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static valkyrie.psi.ValkyrieTypes.*;
import valkyrie.psi.mixin.MixinExpressionTag;

public class ValkyrieExpressionTagNode extends MixinExpressionTag implements ValkyrieExpressionTag {

    public ValkyrieExpressionTagNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ValkyrieVisitor visitor) {
        visitor.visitExpressionTag(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public ValkyrieExpression getExpression() {
        return findNotNullChildByClass(ValkyrieExpression.class);
    }

    @Override
    @Nullable
    public ValkyrieIdentifierFree getIdentifierFree() {
        return findChildByClass(ValkyrieIdentifierFree.class);
    }

}