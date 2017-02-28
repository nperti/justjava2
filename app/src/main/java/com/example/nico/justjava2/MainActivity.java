package com.example.nico.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 0;

    public void submitOrder (View view){
        int price = calculatePrice();
        displayMessage(createSummaryOrder(price));
    }
    private String createSummaryOrder (int price) {
        String priceMessage = "Name: Laura Escalante "
                + "\n Quantity: " + quantity
                + "\n Total: $" + price
                + "\n Thank you!";
        return priceMessage;
    }
    private int calculatePrice (){
        return quantity * 5;
    }
    private void displayMessage (String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment (View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement (View view) {
        quantity = quantity - 1;
        display(quantity);
    }

}
