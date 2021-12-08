package com.example.kiosk_help_app.copying.fastfood;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.copying.cafe.CopyingCafeLatteFragment;
import com.example.kiosk_help_app.copying.fastfood.CopyingFastfoodStoreActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CopyingFastfoodPremiumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CopyingFastfoodPremiumFragment extends Fragment {

    private boolean isClick = false;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CopyingFastfoodPremiumFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CopyingFastfoodPremiumFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CopyingFastfoodPremiumFragment newInstance(String param1, String param2) {
        CopyingFastfoodPremiumFragment fragment = new CopyingFastfoodPremiumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_copying_fastfood_premium, container, false);
        // Fragment에서는 onClick을 사용할 수 없기때문에,  별도로 리스너를 달아서 클릭이벤트를 지정한다.
        ImageButton premium_item_1 = (ImageButton) rootview.findViewById(R.id.FF_premium_item1);

        premium_item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((CopyingFastfoodStoreActivity) getActivity()).addFFPremiumMenuHandler(1);
            }
        });

        Animation blink = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.blink_animation);
        BlinkAnimationListener blinkAnim = new BlinkAnimationListener();
        blink.setAnimationListener(blinkAnim);
        ImageButton premium_item_2 = (ImageButton) rootview.findViewById(R.id.FF_premium_item2);
        premium_item_2.startAnimation(blink);
        premium_item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                premium_item_2.clearAnimation();
                ((CopyingFastfoodStoreActivity) getActivity()).addFFPremiumMenuHandler(2);
            }
        });
        ImageButton premium_item_3 = (ImageButton) rootview.findViewById(R.id.FF_premium_item3);
        premium_item_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((CopyingFastfoodStoreActivity) getActivity()).addFFPremiumMenuHandler(3);
            }
        });
        ImageButton premium_item_4 = (ImageButton) rootview.findViewById(R.id.FF_premium_item4);
        premium_item_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((CopyingFastfoodStoreActivity) getActivity()).addFFPremiumMenuHandler(4);
            }
        });

        return rootview;
    }
    private class BlinkAnimationListener implements Animation.AnimationListener{
        public void onAnimationEnd(Animation anim){
            if(isClick)
                isClick = false;
            else
                isClick = true;
        }
        @Override
        public void onAnimationStart(Animation anim){

        }
        @Override
        public void onAnimationRepeat(Animation anim){

        }
    }

    public boolean isClickButton(){
        return isClick;
    }
}