// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static valkyrie.psi.ValkyrieTypes.*;
import valkyrie.psi.ValkyrieElement;

public class ValkyrieAtomicNode extends ValkyrieElement implements ValkyrieAtomic {

    public ValkyrieAtomicNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ValkyrieVisitor visitor) {
        visitor.visitAtomic(this);
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
    public ValkyrieFunctionCall getFunctionCall() {
        return findChildByClass(ValkyrieFunctionCall.class);
    }

    @Override
    @Nullable
    public ValkyrieMacroCall getMacroCall() {
        return findChildByClass(ValkyrieMacroCall.class);
    }

    @Override
    @Nullable
    public ValkyrieNamepath getNamepath() {
        return findChildByClass(ValkyrieNamepath.class);
    }

    @Override
    @Nullable
    public ValkyrieNumber getNumber() {
        return findChildByClass(ValkyrieNumber.class);
    }

    @Override
    @Nullable
    public ValkyrieOffsetRange getOffsetRange() {
        return findChildByClass(ValkyrieOffsetRange.class);
    }

    @Override
    @Nullable
    public ValkyrieOrdinalRange getOrdinalRange() {
        return findChildByClass(ValkyrieOrdinalRange.class);
    }

    @Override
    @Nullable
    public ValkyrieString getString() {
        return findChildByClass(ValkyrieString.class);
    }

}
