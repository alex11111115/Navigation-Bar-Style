package com.kilobyte.navigationbarstyle;

import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.content.res.ColorStateList;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.ViewGroup;
import eightbitlab.com.blurview.RenderScriptBlur;
import android.view.ViewOutlineProvider;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import eightbitlab.com.blurview.BlurView;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout main;
	private LinearLayout LinearLayout3;
	private BlurView blurView;
	private TextView textview1;
	private LinearLayout background;
	private LinearLayout LinearLayout11;
	private LinearLayout back2;
	private LinearLayout LinearLayout8;
	private LinearLayout back;
	private LinearLayout LinearLayout6;
	private LinearLayout back3;
	private LinearLayout LinearLayout5;
	private LinearLayout back4;
	private LinearLayout LinearLayout13;
	private LinearLayout b2;
	private LinearLayout above2;
	private ImageView img2;
	private TextView t2;
	private LinearLayout b1;
	private LinearLayout above;
	private ImageView amg1;
	private TextView t1;
	private LinearLayout b3;
	private LinearLayout above3;
	private ImageView img3;
	private TextView t3;
	private LinearLayout b4;
	private LinearLayout above4;
	private ImageView img4;
	private TextView t4;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		main = findViewById(R.id.main);
		LinearLayout3 = findViewById(R.id.LinearLayout3);
		blurView = findViewById(R.id.blurView);
		textview1 = findViewById(R.id.textview1);
		background = findViewById(R.id.background);
		LinearLayout11 = findViewById(R.id.LinearLayout11);
		back2 = findViewById(R.id.back2);
		LinearLayout8 = findViewById(R.id.LinearLayout8);
		back = findViewById(R.id.back);
		LinearLayout6 = findViewById(R.id.LinearLayout6);
		back3 = findViewById(R.id.back3);
		LinearLayout5 = findViewById(R.id.LinearLayout5);
		back4 = findViewById(R.id.back4);
		LinearLayout13 = findViewById(R.id.LinearLayout13);
		b2 = findViewById(R.id.b2);
		above2 = findViewById(R.id.above2);
		img2 = findViewById(R.id.img2);
		t2 = findViewById(R.id.t2);
		b1 = findViewById(R.id.b1);
		above = findViewById(R.id.above);
		amg1 = findViewById(R.id.amg1);
		t1 = findViewById(R.id.t1);
		b3 = findViewById(R.id.b3);
		above3 = findViewById(R.id.above3);
		img3 = findViewById(R.id.img3);
		t3 = findViewById(R.id.t3);
		b4 = findViewById(R.id.b4);
		above4 = findViewById(R.id.above4);
		img4 = findViewById(R.id.img4);
		t4 = findViewById(R.id.t4);
		
		above2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_selectPage(1);
			}
		});
		
		above.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_selectPage(2);
			}
		});
		
		above3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_selectPage(3);
			}
		});
		
		above4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_selectPage(4);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("by Obieda");
		_selectPage(1);
		above2.performClick();
		_blurr(20, blurView);
	}
	
	public void _Icon_Colour(final ImageView _iconview, final String _colour) {
		_iconview.getDrawable().setColorFilter(Color.parseColor(_colour), PorterDuff.Mode.SRC_IN);
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		GradientDrawable GG = new GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float) _round);
		GG.setStroke((int) _stroke, Color.parseColor(_strokeclr));
		RippleDrawable RE = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
		
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _selectPage(final int _page) {
		_resetPages();
		switch(_page) {
			case ((int)1): {
				textview1.setText("Page1");
				t2.setVisibility(View.VISIBLE);
				t1.setVisibility(View.GONE);
				t3.setVisibility(View.GONE);
				t4.setVisibility(View.GONE);
				_rippleRoundStroke(above, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above3, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above4, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_animatePageSelection(above2, t2, img2);
				break;
			}
			case ((int)2): {
				textview1.setText("Page2");
				t2.setVisibility(View.GONE);
				t1.setVisibility(View.VISIBLE);
				t3.setVisibility(View.GONE);
				t4.setVisibility(View.GONE);
				_rippleRoundStroke(above2, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above3, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above4, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_animatePageSelection(above, t1, amg1);
				break;
			}
			case ((int)3): {
				textview1.setText("Page3");
				t2.setVisibility(View.GONE);
				t1.setVisibility(View.GONE);
				t3.setVisibility(View.VISIBLE);
				t4.setVisibility(View.GONE);
				_rippleRoundStroke(above2, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above4, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_animatePageSelection(above3, t3, img3);
				break;
			}
			case ((int)4): {
				textview1.setText("Page4");
				t2.setVisibility(View.GONE);
				t1.setVisibility(View.GONE);
				t3.setVisibility(View.GONE);
				t4.setVisibility(View.VISIBLE);
				_rippleRoundStroke(above2, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_rippleRoundStroke(above3, "#00FFFFFF", "#40FFFFFF", 20, 0, "#000000");
				_animatePageSelection(above4, t4, img4);
				break;
			}
		}
		_smoothBackgroundTransition();
	}
	
	
	public void _smoothBackgroundTransition() {
		ObjectAnimator animator = ObjectAnimator.ofFloat(background, "translationY", 0f);
		animator.setDuration(700);
		animator.setInterpolator(new AccelerateDecelerateInterpolator());
		animator.start();
		
	}
	
	
	public void _resetPages() {
		textview1.setText("");
		_Icon_Colour(img2, "#E0E0E0");
		t2.setTextColor(0xFFE0E0E0);
		_Icon_Colour(amg1, "#E0E0E0");
		t1.setTextColor(0xFFE0E0E0);
		_Icon_Colour(img3, "#E0E0E0");
		t3.setTextColor(0xFFE0E0E0);
		_Icon_Colour(img4, "#E0E0E0");
		t4.setTextColor(0xFFE0E0E0);
	}
	
	
	public void _animatePageSelection(final View _aboveLayout, final TextView _selectedText, final ImageView _selectedIcon) {
		_rippleRoundStroke(_aboveLayout, "#3AFFFFFF", "#40FFFFFF", 20, 0, "#000000");
		_selectedText.setTextColor(0xFFFFFFFF);
		_Icon_Colour(_selectedIcon, "#FFFFFF");
		_selectedText.setVisibility(View.VISIBLE);
		_TransitionManager(background, 850);
	}
	
	
	public void _blurr(final double _value, final BlurView _view) {
		// Define your radius value
		float radius = ((float)_value);
		
		View decorView = getWindow().getDecorView();
		ViewGroup rootView = decorView.findViewById(android.R.id.content);
		android.graphics.drawable.Drawable windowBackground = decorView.getBackground();
		
		// Set up the blur view
		_view.setupWith(rootView)
		.setFrameClearDrawable(windowBackground)
		.setBlurAlgorithm(new RenderScriptBlur(this))
		.setBlurRadius(radius)
		.setBlurAutoUpdate(true)
		.setHasFixedTransformationMatrix(true)
		.setOverlayColor(0x602196F3);
		
		// إضافة الحواف المدورة
		final float cornerRadius = getResources().getDimension(R.dimen.blur_corner_radius);
		_view.setOutlineProvider(new ViewOutlineProvider() {
				@Override
				public void getOutline(View view, Outline outline) {
						outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cornerRadius);
				}
		});
		_view.setClipToOutline(true);
		
	}
	
}