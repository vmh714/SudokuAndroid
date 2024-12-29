package vn.edu.usth.sudoku;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView dateTextView, scoreTextView, timerTextView;
    private Button startGameButton, continueGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGameButton = findViewById(R.id.start_game_button);
        continueGameButton = findViewById(R.id.continue_game_button);

        // Set the current date
        String currentDate = new SimpleDateFormat("dd 'tháng' MM", Locale.getDefault()).format(new Date());
        dateTextView.setText(currentDate);

        // Example score (you can replace it with actual game logic)
        scoreTextView.setText("Điểm Cao Nhất Của Mọi Thời Điểm: 7.505");
        timerTextView.setText("04:02 - Dễ");

        // Start new game
        startGameButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SudokuGameActivity.class);
            startActivity(intent);
        });

        // Continue existing game logic (if applicable)
        continueGameButton.setOnClickListener(v -> {
            // Logic to continue the game
        });
    }
    GridLayout sudokuGrid = findViewById(R.id.sudoku_grid);

    // Ví dụ: Thêm một nút vào ô đầu tiên (hàng 0, cột 0)
    Button button = new Button(this);
    button.setText("5"); // Đặt giá trị ban đầu nếu cần
    button.setBackgroundResource(R.drawable.grid_cell_border); // Đặt viền
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Xử lý nhấp chuột vào ô
        }
    });
    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
    params.rowSpec = GridLayout.spec(0); // Hàng 0
    params.columnSpec = GridLayout.spec(0); // Cột 0
    sudokuGrid.addView(button, params);


}