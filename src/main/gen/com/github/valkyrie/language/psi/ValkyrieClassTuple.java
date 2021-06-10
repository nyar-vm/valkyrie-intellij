// This is a generated file. Not intended for manual editing.
package com.github.valkyrie.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.github.valkyrie.ide.view.ValkyrieViewElement;

public interface ValkyrieClassTuple extends PsiElement {

  @NotNull
  List<ValkyrieClassItem> getClassItemList();

  @NotNull
  List<ValkyrieMacroCall> getMacroCallList();

  void addChildrenView(@NotNull List<ValkyrieViewElement> list);

}
