// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.valkyrie.language.psi.ValkyrieTypes.*;
import com.github.valkyrie.language.mixin.ValkyrieEnumMixin;
import com.github.valkyrie.language.psi.*;

public class ValkyrieTaggedStatementNode extends ValkyrieEnumMixin implements ValkyrieTaggedStatement {

  public ValkyrieTaggedStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValkyrieVisitor visitor) {
    visitor.visitTaggedStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValkyrieModifierSymbols getModifierSymbols() {
    return findNotNullChildByClass(ValkyrieModifierSymbols.class);
  }

  @Override
  @NotNull
  public ValkyrieTaggedBlock getTaggedBlock() {
    return findNotNullChildByClass(ValkyrieTaggedBlock.class);
  }

  @Override
  @Nullable
  public ValkyrieTypeAngle getTypeAngle() {
    return findChildByClass(ValkyrieTypeAngle.class);
  }

}