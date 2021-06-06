// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.valkyrie.language.psi.ValkyrieTypes.*;
import com.github.valkyrie.language.mixin.MixinDefine;
import com.github.valkyrie.language.psi.*;
import com.github.valkyrie.language.ast.ASTMethods;
import com.github.valkyrie.language.mixin.MixinNamepath;

public class ValkyrieDefineStatementNode extends MixinDefine implements ValkyrieDefineStatement {

  public ValkyrieDefineStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValkyrieVisitor visitor) {
    visitor.visitDefineStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValkyrieVisitor) accept((ValkyrieVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValkyrieDefineBlock getDefineBlock() {
    return findChildByClass(ValkyrieDefineBlock.class);
  }

  @Override
  @Nullable
  public ValkyrieDefineTuple getDefineTuple() {
    return findChildByClass(ValkyrieDefineTuple.class);
  }

  @Override
  @Nullable
  public ValkyrieGenericDefine getGenericDefine() {
    return findChildByClass(ValkyrieGenericDefine.class);
  }

  @Override
  @NotNull
  public ValkyrieModified getModified() {
    return findNotNullChildByClass(ValkyrieModified.class);
  }

  @Override
  @Nullable
  public ValkyrieTypeExpression getTypeExpression() {
    return findChildByClass(ValkyrieTypeExpression.class);
  }

  @Override
  @NotNull
  public MixinNamepath getNamepath() {
    return ASTMethods.getNamepath(this);
  }

  @Override
  @NotNull
  public ValkyrieIdentifierNode[] getModifiers() {
    return ASTMethods.getModifiers(this);
  }

}
