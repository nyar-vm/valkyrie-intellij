// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValkyrieTypeExpression extends PsiElement {

  @NotNull
  List<ValkyrieTypeBinary> getTypeBinaryList();

  @NotNull
  List<ValkyrieTypeTerm> getTypeTermList();

}
