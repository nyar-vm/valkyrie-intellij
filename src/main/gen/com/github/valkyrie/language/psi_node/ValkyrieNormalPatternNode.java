// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.valkyrie.language.psi.ValkyrieTypes.*;
import com.github.valkyrie.language.mixin.MixinNormalPattern;
import com.github.valkyrie.language.psi.*;
import com.github.valkyrie.language.ast.ASTMethods;

public class ValkyrieNormalPatternNode extends MixinNormalPattern implements ValkyrieNormalPattern {

  public ValkyrieNormalPatternNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValkyrieVisitor visitor) {
    visitor.visitNormalPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValkyrieBraceBlock getBraceBlock() {
    return findChildByClass(ValkyrieBraceBlock.class);
  }

  @Override
  @Nullable
  public ValkyrieBracketBlock getBracketBlock() {
    return findChildByClass(ValkyrieBracketBlock.class);
  }

  @Override
  @NotNull
  public List<ValkyrieIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValkyrieIdentifier.class);
  }

  @Override
  @Nullable
  public ValkyrieParenthesis getParenthesis() {
    return findChildByClass(ValkyrieParenthesis.class);
  }

  @Override
  @Nullable
  public ValkyrieSequence getSequence() {
    return findChildByClass(ValkyrieSequence.class);
  }

}
