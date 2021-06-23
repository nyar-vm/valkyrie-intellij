// This is a generated file. Not intended for manual editing.
package valkyrie.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static valkyrie.language.psi.ValkyrieTypes.*;
import valkyrie.language.mixin.MixinExtension;
import valkyrie.language.psi.*;
import valkyrie.language.ast.ASTMethods;

public class ValkyrieExtensionStatementNode extends MixinExtension implements ValkyrieExtensionStatement {

  public ValkyrieExtensionStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValkyrieVisitor visitor) {
    visitor.visitExtensionStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValkyrieIdentifier getIdentifier() {
    return findNotNullChildByClass(ValkyrieIdentifier.class);
  }

  @Override
  @NotNull
  public ValkyrieNamepathFree getNamepathFree() {
    return findNotNullChildByClass(ValkyrieNamepathFree.class);
  }

  @Override
  @NotNull
  public ValkyrieTopBlock getTopBlock() {
    return findNotNullChildByClass(ValkyrieTopBlock.class);
  }

}