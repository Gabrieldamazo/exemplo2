package sp.senac.br.exemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] planeta = {"Homem de Ferro", "Thor", "Hulk", "captain", "Batman", "Superman", "Flash", "Homem Aranha"};
    int[] imagePlaneta = {R.drawable.homem de ferro, R.drawable.thor, R.drawable.hulk, R.drawable.captain,
    R.drawable.batman, R.drawable.superman, R.drawable.flash, R.drawable.spiderman};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount(){
            return imagePlaneta.length;
        }

        @Override
        public Object getItem(int position){
        return null;
    }
    @Override
    public long getItemId(int position) {
        return Os
    }
    @Override
        public View getView(int position View convert)1

    }

