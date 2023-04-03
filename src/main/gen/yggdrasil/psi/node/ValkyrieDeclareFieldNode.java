// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static valkyrie.psi.ValkyrieTypes.*;
import valkyrie.psi.mixin.MixinField;
import valkyrie.ide.highlight.NodeHighlighter;

public class ValkyrieDeclareFieldNode extends MixinField implements ValkyrieDeclareField {

    public ValkyrieDeclareFieldNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ValkyrieVisitor visitor) {
        visitor.visitDeclareField(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<ValkyrieAttribute> getAttributeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, ValkyrieAttribute.class);
    }

    @Override
    @Nullable
    public ValkyrieDefaultValue getDefaultValue() {
        return findChildByClass(ValkyrieDefaultValue.class);
    }

    @Override
    @NotNull
    public List<ValkyrieModifier> getModifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, ValkyrieModifier.class);
    }

    @Override
    @Nullable
    public ValkyrieTypeHint getTypeHint() {
        return findChildByClass(ValkyrieTypeHint.class);
    }

}
