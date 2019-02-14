package smart.com.smdev.magicbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import smart.com.smdev.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {

  MagicButton magicButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    magicButton = (MagicButton) findViewById(R.id.magic_button_github);

    magicButton.setMagicButtonClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this, "GitHub", Toast.LENGTH_SHORT).show();
      }
    });


  }
}
