package com.example.onecloudandroid;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.onecloudandroid.databinding.ActivityHomeBindingImpl;
import com.example.onecloudandroid.databinding.ActivityLogoutBindingImpl;
import com.example.onecloudandroid.databinding.ActivityMainBindingImpl;
import com.example.onecloudandroid.databinding.ActivityRecycleViewBindingImpl;
import com.example.onecloudandroid.databinding.ActivityTabBindingImpl;
import com.example.onecloudandroid.databinding.FragmentCallBindingImpl;
import com.example.onecloudandroid.databinding.FragmentChatBindingImpl;
import com.example.onecloudandroid.databinding.FragmentFirstTabBindingImpl;
import com.example.onecloudandroid.databinding.FragmentMeetingBindingImpl;
import com.example.onecloudandroid.databinding.FragmentProfileBindingImpl;
import com.example.onecloudandroid.databinding.FragmentSecondTabBindingImpl;
import com.example.onecloudandroid.databinding.ProfileItem2BindingImpl;
import com.example.onecloudandroid.databinding.ProfileItem3BindingImpl;
import com.example.onecloudandroid.databinding.ProfileItemBindingImpl;
import com.example.onecloudandroid.databinding.RecyclerItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYLOGOUT = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYRECYCLEVIEW = 4;

  private static final int LAYOUT_ACTIVITYTAB = 5;

  private static final int LAYOUT_FRAGMENTCALL = 6;

  private static final int LAYOUT_FRAGMENTCHAT = 7;

  private static final int LAYOUT_FRAGMENTFIRSTTAB = 8;

  private static final int LAYOUT_FRAGMENTMEETING = 9;

  private static final int LAYOUT_FRAGMENTPROFILE = 10;

  private static final int LAYOUT_FRAGMENTSECONDTAB = 11;

  private static final int LAYOUT_PROFILEITEM = 12;

  private static final int LAYOUT_PROFILEITEM2 = 13;

  private static final int LAYOUT_PROFILEITEM3 = 14;

  private static final int LAYOUT_RECYCLERITEM = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.activity_logout, LAYOUT_ACTIVITYLOGOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.activity_recycle_view, LAYOUT_ACTIVITYRECYCLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.activity_tab, LAYOUT_ACTIVITYTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_call, LAYOUT_FRAGMENTCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_first_tab, LAYOUT_FRAGMENTFIRSTTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_meeting, LAYOUT_FRAGMENTMEETING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.fragment_second_tab, LAYOUT_FRAGMENTSECONDTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.profile_item, LAYOUT_PROFILEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.profile_item2, LAYOUT_PROFILEITEM2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.profile_item3, LAYOUT_PROFILEITEM3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.onecloudandroid.R.layout.recycler_item, LAYOUT_RECYCLERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGOUT: {
          if ("layout/activity_logout_0".equals(tag)) {
            return new ActivityLogoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_logout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECYCLEVIEW: {
          if ("layout/activity_recycle_view_0".equals(tag)) {
            return new ActivityRecycleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recycle_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAB: {
          if ("layout/activity_tab_0".equals(tag)) {
            return new ActivityTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCALL: {
          if ("layout/fragment_call_0".equals(tag)) {
            return new FragmentCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_call is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHAT: {
          if ("layout/fragment_chat_0".equals(tag)) {
            return new FragmentChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFIRSTTAB: {
          if ("layout/fragment_first_tab_0".equals(tag)) {
            return new FragmentFirstTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_first_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEETING: {
          if ("layout/fragment_meeting_0".equals(tag)) {
            return new FragmentMeetingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_meeting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSECONDTAB: {
          if ("layout/fragment_second_tab_0".equals(tag)) {
            return new FragmentSecondTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_second_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEITEM: {
          if ("layout/profile_item_0".equals(tag)) {
            return new ProfileItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEITEM2: {
          if ("layout/profile_item2_0".equals(tag)) {
            return new ProfileItem2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_item2 is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEITEM3: {
          if ("layout/profile_item3_0".equals(tag)) {
            return new ProfileItem3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_item3 is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERITEM: {
          if ("layout/recycler_item_0".equals(tag)) {
            return new RecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
      sKeys.put(2, "description");
      sKeys.put(3, "title");
      sKeys.put(4, "toolbar");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_home_0", com.example.onecloudandroid.R.layout.activity_home);
      sKeys.put("layout/activity_logout_0", com.example.onecloudandroid.R.layout.activity_logout);
      sKeys.put("layout/activity_main_0", com.example.onecloudandroid.R.layout.activity_main);
      sKeys.put("layout/activity_recycle_view_0", com.example.onecloudandroid.R.layout.activity_recycle_view);
      sKeys.put("layout/activity_tab_0", com.example.onecloudandroid.R.layout.activity_tab);
      sKeys.put("layout/fragment_call_0", com.example.onecloudandroid.R.layout.fragment_call);
      sKeys.put("layout/fragment_chat_0", com.example.onecloudandroid.R.layout.fragment_chat);
      sKeys.put("layout/fragment_first_tab_0", com.example.onecloudandroid.R.layout.fragment_first_tab);
      sKeys.put("layout/fragment_meeting_0", com.example.onecloudandroid.R.layout.fragment_meeting);
      sKeys.put("layout/fragment_profile_0", com.example.onecloudandroid.R.layout.fragment_profile);
      sKeys.put("layout/fragment_second_tab_0", com.example.onecloudandroid.R.layout.fragment_second_tab);
      sKeys.put("layout/profile_item_0", com.example.onecloudandroid.R.layout.profile_item);
      sKeys.put("layout/profile_item2_0", com.example.onecloudandroid.R.layout.profile_item2);
      sKeys.put("layout/profile_item3_0", com.example.onecloudandroid.R.layout.profile_item3);
      sKeys.put("layout/recycler_item_0", com.example.onecloudandroid.R.layout.recycler_item);
    }
  }
}
