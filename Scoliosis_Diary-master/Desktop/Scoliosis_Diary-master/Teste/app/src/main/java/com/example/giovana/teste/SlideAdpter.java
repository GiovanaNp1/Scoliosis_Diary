package com.example.giovana.teste;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.giovana.teste.R;

public class SlideAdpter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //list image
    public int[] lst_images = {
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_8,
    };

    //list of titles
    public String[] lst_title = {
            "LEMBRETE",
            "BEM ESTAR",
            "QUERIDO DIÁRIO...",
            "LEVANTAMENTO",
    };

    //list of description
    public String[] lst_description = {
            "Tem consultas para ir? Remédio á tomar? Clique na data e crie um lembrete. Organize-se!",
            "Para documentar a intensidade da sua dor e o quanto um tratamento afeta em seu humor, clique na data e classifique-as de acordo com nossa escala",
            "Se você preferir, em 'diário' é possível detalhar outros acontecimentos do dia referentes a escoliose",
            "Clicando em histórico você tem acesso aos dados armazenados nos dias anteriores",
    };

    //list of background colors
    public int[] lst_backgroundcolor = {
            Color.rgb(255, 193, 37),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),

    };


    public SlideAdpter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slideLinearLayout);
        ImageView imageslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView textslide = (TextView) view.findViewById(R.id.txttittle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imageslide.setImageResource(lst_images[position]);
        textslide.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
