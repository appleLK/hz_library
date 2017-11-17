package qqkj.qqkj_library.view.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Fragment处理工具类
 * <p>
 * Created by 陈二狗 on 2017/11/17.
 */

public class FragmentUtil {

    public static FragmentUtil getIns(){

        return new FragmentUtil();
    }


    /**
     * 销毁子Fragment,在OnDestroy方法中调用
     * @param _manager
     * @param _child_manager
     * @param _child_id
     */
    public void _get_destroy_child_fragment(FragmentManager _manager, FragmentManager _child_manager, int _child_id){

        Fragment fragment = _child_manager.findFragmentById(_child_id);

        _manager.beginTransaction().remove(fragment).commit();
    }
}
