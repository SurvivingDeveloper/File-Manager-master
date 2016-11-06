// Generated code from Butter Knife. Do not modify!
package com.simplemobiletools.filemanager.activities;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SettingsActivity$$ViewBinder<T extends SettingsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558512, "field 'mDarkThemeSwitch'");
    target.mDarkThemeSwitch = finder.castView(view, 2131558512, "field 'mDarkThemeSwitch'");
    view = finder.findRequiredView(source, 2131558515, "field 'mShowHiddenSwitch'");
    target.mShowHiddenSwitch = finder.castView(view, 2131558515, "field 'mShowHiddenSwitch'");
    view = finder.findRequiredView(source, 2131558518, "field 'mShowFullPathSwitch'");
    target.mShowFullPathSwitch = finder.castView(view, 2131558518, "field 'mShowFullPathSwitch'");
    view = finder.findRequiredView(source, 2131558510, "method 'handleDarkTheme'");
    unbinder.view2131558510 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.handleDarkTheme();
      }
    });
    view = finder.findRequiredView(source, 2131558513, "method 'handleShowHidden'");
    unbinder.view2131558513 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.handleShowHidden();
      }
    });
    view = finder.findRequiredView(source, 2131558516, "method 'handleShowFullPath'");
    unbinder.view2131558516 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.handleShowFullPath();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SettingsActivity> implements Unbinder {
    private T target;

    View view2131558510;

    View view2131558513;

    View view2131558516;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.mDarkThemeSwitch = null;
      target.mShowHiddenSwitch = null;
      target.mShowFullPathSwitch = null;
      view2131558510.setOnClickListener(null);
      view2131558513.setOnClickListener(null);
      view2131558516.setOnClickListener(null);
    }
  }
}
