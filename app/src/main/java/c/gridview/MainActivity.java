package c.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] androidVersionImages =
            new int[]{R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six
                    , R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven,
                    R.drawable.twelve, R.drawable.thirteen, R.drawable.fourteen, R.drawable.fifteen};

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                gridView = (GridView) findViewById(R.id.gridview);

//        Object of the ImageAdaptor Class to Implement BaseAdaptor class
        ImageAdaptor imageAdaptor = new ImageAdaptor();
//        Setting adaptor to the Grid View
        gridView.setAdapter(imageAdaptor);

    }

    //    Implementing The BaseAdaptor Class using subClass ImageAdaptor
    class ImageAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return androidVersionImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

//            Creating Image View and Setting the Parameters and setting the Images to be displayed from the Image Array
            ImageView imageView;
            imageView = new ImageView(MainActivity.this);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setImageResource(androidVersionImages[i]);

            return imageView;
        }
    }
}