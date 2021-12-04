package com.example.kiosk_help_app.alone.cafe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.fastfood.AloneFastfoodStoreActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AloneCafeAdeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AloneCafeAdeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AloneCafeAdeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AloneCafeAdeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AloneCafeAdeFragment newInstance(String param1, String param2) {
        AloneCafeAdeFragment fragment = new AloneCafeAdeFragment();
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
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_alone_cafe_ade, container, false);
        // Fragment에서는 onClick을 사용할 수 없기때문에,  별도로 리스너를 달아서 클릭이벤트를 지정한다.
        ImageButton drink_item_1 = (ImageButton) rootview.findViewById(R.id.cafe_ade_item1);
        drink_item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AloneCafeStoreActivity) getActivity()).addCafeAdeMenuHandler(1);
            }
        });

        ImageButton drink_item_2 = (ImageButton) rootview.findViewById(R.id.cafe_ade_item2);
        drink_item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AloneCafeStoreActivity) getActivity()).addCafeAdeMenuHandler(2);
            }
        });
        ImageButton drink_item_3 = (ImageButton) rootview.findViewById(R.id.cafe_ade_item3);
        drink_item_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AloneCafeStoreActivity) getActivity()).addCafeAdeMenuHandler(3);
            }
        });
        ImageButton drink_item_4 = (ImageButton) rootview.findViewById(R.id.cafe_ade_item4);
        drink_item_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AloneCafeStoreActivity) getActivity()).addCafeAdeMenuHandler(4);
            }
        });

        return rootview;
    }
}