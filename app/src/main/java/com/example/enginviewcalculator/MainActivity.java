package com.example.enginviewcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Toolbar myToolbar;
    int mDischarge = 0;
    String mDisplay ="";
    private TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        initViews();
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        myToolbar.getMenu().findItem(R.id.action_calc).setEnabled(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_calc:
                findViewById(R.id.WorkLineCalc).setVisibility(View.VISIBLE);
                findViewById(R.id.WorkLineEng).setVisibility(View.GONE);
                myToolbar.getMenu().findItem(R.id.action_calc).setEnabled(false);
                myToolbar.getMenu().findItem(R.id.action_eng).setEnabled(true);
                break;
            case R.id.action_eng:
                findViewById(R.id.WorkLineCalc).setVisibility(View.GONE);
                findViewById(R.id.WorkLineEng).setVisibility(View.VISIBLE);
                myToolbar.getMenu().findItem(R.id.action_calc).setEnabled(true);
                myToolbar.getMenu().findItem(R.id.action_eng).setEnabled(false);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initViews() {
        txtDisplay = findViewById(R.id.txtDisplay);
        Button mBtnCalcClear = findViewById(R.id.btnCalcClear);
        Button mBtnCalcPm = findViewById(R.id.btnCalcPm);
        Button mBtnCalcPercent = findViewById(R.id.btnCalcPercent);
        Button mBtnCalcShare = findViewById(R.id.btnCalcShare);
        Button mBtnCalcSeven = findViewById(R.id.btnCalcSeven);
        Button mBtnCalcEight = findViewById(R.id.btnCalcEight);
        Button mBtnCalcNine = findViewById(R.id.btnCalcNine);
        Button mBtnCalcMultiply = findViewById(R.id.btnCalcMultiply);
        Button mBtnCalcFour = findViewById(R.id.btnCalcFour);
        Button mBtnCalcFive = findViewById(R.id.btnCalcFive);
        Button mBtnCalcSix = findViewById(R.id.btnCalcSix);
        Button mBtnCalcMinus = findViewById(R.id.btnCalcMinus);
        Button mBtnCalcOne = findViewById(R.id.btnCalcOne);
        Button mBtnCalcTwo = findViewById(R.id.btnCalcTwo);
        Button mBtnCalcThree = findViewById(R.id.btnCalcThree);
        Button mBtnCalcPlus = findViewById(R.id.btnCalcPlus);
        Button mBtnCalcZero = findViewById(R.id.btnCalcZero);
        Button mBtnCalcPoint = findViewById(R.id.btnCalcPoint);
        Button mBtnCalcEqually = findViewById(R.id.btnCalcEqually);
        Button mBtnEngDegreeTwo = findViewById(R.id.btnEngDegreeTwo);
        Button mBtnEngModule = findViewById(R.id.btnEngModule);
        Button mBtnEngExp = findViewById(R.id.btnEngExp);
        Button mBtnEngMod = findViewById(R.id.btnEngMod);
        Button mBtnEngFactorial = findViewById(R.id.btnEngFactorial);
        Button mBtnEngDegreeThree = findViewById(R.id.btnEngDegreeThree);
        Button mBtnEngBracketLeft = findViewById(R.id.btnEngBracketLeft);
        Button mBtnEngBracketRight = findViewById(R.id.btnEngBracketRight);
        Button mBtnEngLn = findViewById(R.id.btnEngLn);
        Button mBtnEngLog = findViewById(R.id.btnEngLog);
        Button mBtnEngCos = findViewById(R.id.btnEngCos);
        Button mBtnEngClear = findViewById(R.id.btnEngClear);
        Button mBtnEngPm = findViewById(R.id.btnEngPm);
        Button mBtnEngPercent = findViewById(R.id.btnEngPercent);
        Button mBtnEngShare = findViewById(R.id.btnEngShare);
        Button mBtnEngSin = findViewById(R.id.btnEngSin);
        Button mBtnEngSeven = findViewById(R.id.btnEngSeven);
        Button mBtnEngEight = findViewById(R.id.btnEngEight);
        Button mBtnEngNine = findViewById(R.id.btnEngNine);
        Button mBtnEngMultiply = findViewById(R.id.btnEngMultiply);
        Button mBtnEngTan = findViewById(R.id.btnEngTan);
        Button mBtnEngFour = findViewById(R.id.btnEngFour);
        Button mBtnEngFive = findViewById(R.id.btnEngFive);
        Button mBtnEngSix = findViewById(R.id.btnEngSix);
        Button mBtnEngMinus = findViewById(R.id.btnEngMinus);
        Button mBtnEngCot = findViewById(R.id.btnEngCot);
        Button mBtnEngOne = findViewById(R.id.btnEngOne);
        Button mBtnEngTwo = findViewById(R.id.btnEngTwo);
        Button mBtnEngThree = findViewById(R.id.btnEngThree);
        Button mBtnEngPlus = findViewById(R.id.btnEngPlus);
        Button mBtnEngSec = findViewById(R.id.btnEngSec);
        Button mBtnEngZero = findViewById(R.id.btnEngZero);
        Button mBtnEngPoint = findViewById(R.id.btnEngPoint);
        Button mBtnEngEqually = findViewById(R.id.btnEngEqually);
        // Установим текст на кнопках
        mBtnCalcClear.setText(R.string.btnTextCalcClear);
        mBtnCalcPm.setText(R.string.btnTextCalcPm);
        mBtnCalcPercent.setText(R.string.btnTextCalcPercent);
        mBtnCalcShare.setText(R.string.btnTextCalcShare);
        mBtnCalcSeven.setText(R.string.btnTextCalcSeven);
        mBtnCalcEight.setText(R.string.btnTextCalcEight);
        mBtnCalcNine.setText(R.string.btnTextCalcNine);
        mBtnCalcMultiply.setText(R.string.btnTextCalcMultiply);
        mBtnCalcFour.setText(R.string.btnTextCalcFour);
        mBtnCalcFive.setText(R.string.btnTextCalcFive);
        mBtnCalcSix.setText(R.string.btnTextCalcSix);
        mBtnCalcMinus.setText(R.string.btnTextCalcMinus);
        mBtnCalcOne.setText(R.string.btnTextCalcOne);
        mBtnCalcTwo.setText(R.string.btnTextCalcTwo);
        mBtnCalcThree.setText(R.string.btnTextCalcThree);
        mBtnCalcPlus.setText(R.string.btnTextCalcPlus);
        mBtnCalcZero.setText(R.string.btnTextCalcZero);
        mBtnCalcPoint.setText(R.string.btnTextCalcPoint);
        mBtnCalcEqually.setText(R.string.btnTextCalcEqually);
        mBtnEngDegreeTwo.setText(R.string.btnTextEngDegreeTwo);
        mBtnEngModule.setText(R.string.btnTextEngModule);
        mBtnEngExp.setText(R.string.btnTextEngExp);
        mBtnEngMod.setText(R.string.btnTextEngMod);
        mBtnEngFactorial.setText(R.string.btnTextEngFactorial);
        mBtnEngDegreeThree.setText(R.string.btnTextEngDegreeThree);
        mBtnEngBracketLeft.setText(R.string.btnTextEngBracketLeft);
        mBtnEngBracketRight.setText(R.string.btnTextEngBracketRight);
        mBtnEngLn.setText(R.string.btnTextEngLn);
        mBtnEngLog.setText(R.string.btnTextEngLog);
        mBtnEngCos.setText(R.string.btnTextEngCos);
        mBtnEngClear.setText(R.string.btnTextEngClear);
        mBtnEngPm.setText(R.string.btnTextEngPm);
        mBtnEngPercent.setText(R.string.btnTextEngPercent);
        mBtnEngShare.setText(R.string.btnTextEngShare);
        mBtnEngSin.setText(R.string.btnTextEngSin);
        mBtnEngSeven.setText(R.string.btnTextEngSeven);
        mBtnEngEight.setText(R.string.btnTextEngEight);
        mBtnEngNine.setText(R.string.btnTextEngNine);
        mBtnEngMultiply.setText(R.string.btnTextEngMultiply);
        mBtnEngTan.setText(R.string.btnTextEngTan);
        mBtnEngFour.setText(R.string.btnTextEngFour);
        mBtnEngFive.setText(R.string.btnTextEngFive);
        mBtnEngSix.setText(R.string.btnTextEngSix);
        mBtnEngMinus.setText(R.string.btnTextEngMinus);
        mBtnEngCot.setText(R.string.btnTextEngCot);
        mBtnEngOne.setText(R.string.btnTextEngOne);
        mBtnEngTwo.setText(R.string.btnTextEngTwo);
        mBtnEngThree.setText(R.string.btnTextEngThree);
        mBtnEngPlus.setText(R.string.btnTextEngPlus);
        mBtnEngSec.setText(R.string.btnTextEngSec);
        mBtnEngZero.setText(R.string.btnTextEngZero);
        mBtnEngPoint.setText(R.string.btnTextEngPoint);
        mBtnEngEqually.setText(R.string.btnTextEngEqually);
        // присваиваем обработчик кнопкам основного блока цыфр
        mBtnCalcClear.setOnClickListener(this);
        mBtnCalcSeven.setOnClickListener(this);
        mBtnCalcEight.setOnClickListener(this);
        mBtnCalcNine.setOnClickListener(this);
        mBtnCalcFour.setOnClickListener(this);
        mBtnCalcFive.setOnClickListener(this);
        mBtnCalcSix.setOnClickListener(this);
        mBtnCalcOne.setOnClickListener(this);
        mBtnCalcTwo.setOnClickListener(this);
        mBtnCalcThree.setOnClickListener(this);
        mBtnCalcZero.setOnClickListener(this);
        mBtnCalcPoint.setOnClickListener(this);
        mBtnEngClear.setOnClickListener(this);
        mBtnEngSeven.setOnClickListener(this);
        mBtnEngEight.setOnClickListener(this);
        mBtnEngNine.setOnClickListener(this);
        mBtnEngFour.setOnClickListener(this);
        mBtnEngFive.setOnClickListener(this);
        mBtnEngSix.setOnClickListener(this);
        mBtnEngOne.setOnClickListener(this);
        mBtnEngTwo.setOnClickListener(this);
        mBtnEngThree.setOnClickListener(this);
        mBtnEngZero.setOnClickListener(this);
        mBtnEngPoint.setOnClickListener(this);
    }
    // Сохраним данные при повороте
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Display", mDisplay);
        outState.putInt("Point", mDischarge);
    }
    // Вернем данные после поворота
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mDisplay = savedInstanceState.getString("Display");
        txtDisplay.setText(mDisplay);
        mDischarge = savedInstanceState.getInt("Point");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalcClear:
            case R.id.btnEngClear:
                txtDisplay.setText("");
                mDischarge = 0;
                break;
        }
        // Проверка длинны не более 10 символов!!!
        if (mDisplay.length()<10) {
            switch (v.getId()) {
                case R.id.btnCalcSeven:
                case R.id.btnEngSeven:
                    txtDisplay.setText(mDisplay + "7");
                    break;
                case R.id.btnCalcEight:
                case R.id.btnEngEight:
                    txtDisplay.setText(mDisplay + "8");
                    break;
                case R.id.btnCalcNine:
                case R.id.btnEngNine:
                    txtDisplay.setText(mDisplay + "9");
                    break;
                case R.id.btnCalcFour:
                case R.id.btnEngFour:
                    txtDisplay.setText(mDisplay + "4");
                    break;
                case R.id.btnCalcFive:
                case R.id.btnEngFive:
                    txtDisplay.setText(mDisplay + "5");
                    break;
                case R.id.btnCalcSix:
                case R.id.btnEngSix:
                    txtDisplay.setText(mDisplay + "6");
                    break;
                case R.id.btnCalcOne:
                case R.id.btnEngOne:
                    txtDisplay.setText(mDisplay + "1");
                    break;
                case R.id.btnCalcTwo:
                case R.id.btnEngTwo:
                    txtDisplay.setText(mDisplay + "2");
                    break;
                case R.id.btnCalcThree:
                case R.id.btnEngThree:
                    txtDisplay.setText(mDisplay + "3");
                    break;
                case R.id.btnCalcZero:
                case R.id.btnEngZero:
                    txtDisplay.setText(mDisplay + "0");
                    break;
                case R.id.btnCalcPoint:
                case R.id.btnEngPoint:
                    // Проверка в тексте наличия запятой
                    if (mDischarge == 0) {
                        txtDisplay.setText(mDisplay + ",");
                        mDischarge = 1;
                    }
                    break;
            }
        }
        // Хранить данный с дисплея в переменной
        mDisplay = (String) txtDisplay.getText();
    }
}