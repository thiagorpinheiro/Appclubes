package sp.senac.br.appclubes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;String[] Clubes = {"Liverpool","Milan","Chelsea","Juventos"};
    int[] imageclubes = {R.drawable.Liverpool, R.drawable.Milan,R.drawable.Chelsea,R.drawable.Juventos };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (listView) findViewById( R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),listadata_Activity.class);
                intent.putExtra("name", Clubes[position]);
                intent.putExtra("image", imageclubes[position]);
                startActivity(intent);
            }
        });
    }


private class  CustomAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return imageclubes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view1 = getLayoutInflater().inflate(R.layout.row_data, null );
        TextView name =
        return null;
    }
    }
    }