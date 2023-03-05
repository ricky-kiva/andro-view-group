package com.rickyslash.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set action title
        supportActionBar?.title = "Google Pixel 1"
    }
}

/* View & View Group Theory */

// 'View' is the basic component that interacts with user via screen
// 'View' hierarchy: https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/original/academy/dos:56000f3565553b48cd87b7589a4fa05c20221202112414.png

// an example of 'View' 'derivative':
// - TextView: display text
// - Button: interactive button
// - ImageView: display an image
// - RecyclerView: show information in list
// - GridView: show information in grid
// - RadioButton: interactive choosing button
// - Checkbox: interactive checking button

// 'ViewGroup' is a 'View' that act as an 'container' for another 'View'
// an example of 'ViewGroup' 'derivative':
// - LinearLayout:
// --- place component 'horizontally/vertically' by 'android:orientation'
// --- the 'portion' could be adjusted by 'weight' for each 'child view'
// --- example: https://d17ivq9b7rppb3.cloudfront.net/original/academy/201611031408538f282c8950a103899135d75d111a22ed.png
// --- example: https://d17ivq9b7rppb3.cloudfront.net/original/academy/201611031408573f981c3190fc431579c7e258ce5252b9.png

// - RelativeLayout:
// --- position of each component could be 'relatively adjusted' to 'another component' / 'screen'
// --- example: https://d17ivq9b7rppb3.cloudfront.net/original/academy/20161103140902a4f57c6dd65a88ff058e3a1c55c00e0c.png

// - ConstraintLayout:
// --- can adjust 'complex group view' by just 'one layer of hierarchy'
// --- it has 'better rendering' than 'nested layout'
// --- it works almost like 'RelativeLayout' but more 'flexible'
// --- It has additional feature:
// ----- Relative Positioning: position component relatively to another component
// ----- Center Positioning & Bias: adjust alignment using percentage
// ----- Baseline Alignment: make a component aligned with another component
// ----- Guideline: make help-line that can't be seen by user
// ----- Barrier: same as 'Guideline' but the position follow another component
// ----- Chain: Adjust a group of component linearly
// ------- Spread: every element spreads with 'same space'
// ------- Spread Inside: 'first & last' element on the 'corner of the screen', with 'element in between' has 'same space'
// ------- Weighted: each 'element' has its 'weight'
// ------- Packed: elements will be 'packed' and sent to 'center' by default

// - FrameLayout:
// --- make element on the inside 'stacked'
// --- the 'first element' declared has 'lower z-index' than 'the next'
// --- example: https://d17ivq9b7rppb3.cloudfront.net/original/academy/201611021451063417adaf355fdf178cc9b1e9ef85bd31.png

// - TableLayout:
// --- component will be 'arranged in table' as 'column & row'

// ScrollView
// is a layout that enables user to 'scroll' the 'activity'