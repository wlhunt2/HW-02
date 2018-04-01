package com.example.will.hw02;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class AppsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AppsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AppsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AppsFragment newInstance(String param1, String param2) {
        AppsFragment fragment = new AppsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }






    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_apps, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    //todo: Need to update this for Apps rather than what this was copied from
    private class GetKeywordsAsync extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            ArrayList<App> result = new ArrayList<>();

//
//            try {
//                URL url = new URL(params[0]);
//                connection = (HttpURLConnection) url.openConnection();
//
//                connection.connect();
//
//
//                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                    //Create Json object and array
//                    String json;
//                    json = IOUtils.toString(connection.getInputStream(), "UTF-8");
//
//
//                    JSONObject root = new JSONObject(json);
//                    Log.d("demo", "Before JSONArray sources = ...");
//                    JSONArray sources = root.getJSONArray("feed");
//
//                    //Log.d("demo","JSONArray sources = "+ sources.toString());
//
//                    //Grabs each json object and stores it in an ArrayList
//                    for (int i = 0; i < sources.length(); i++) {
//                        JSONObject sourceJson = sources.getJSONObject(i);
//
//                        ArrayList<String> qChoices = new ArrayList<>();
//                        App app = new App();
//
//                        question.setId(sourceJson.getString("id"));
//                        question.setText(sourceJson.getString("text"));
//                        question.setImage(sourceJson.optString("image"));   // Uses optString in case there's no image URL
//
//
//                        //This gets each choice from the nested  array of choices
//                        JSONArray q = sourceJson.getJSONObject("choices").getJSONArray("choice");
//
//                        for (int j = 0; j < q.length(); j++) {
//                            //qChoices.add(q.getJSONObject(j).toString());
//                            qChoices.add(q.getString(j));
//                            Log.d("demo", "qChoices: " + qChoices.get(j));
//                        }
//                        question.setChoices(qChoices);
//
//                        //String a = String.valueOf(sourceJson.getJSONObject("choices").getJSONArray("answer"));
//                        String a = sourceJson.getJSONObject("choices").getString("answer");
//                        question.setAnswer(a);
//                        Log.d("demo", "ANSWER = " + question.getAnswer());
//
//
//                        result.add(question);
//                        Log.d("demo", "result = " + result.toString());
//
//                    }
//                }
//            } catch (Exception e) {
//                //Handle Exceptions
//                Log.d("demo", String.valueOf(e));
//                Log.d("demo", "TriviaAsyncTask Exception");
//            } finally {
//                //Close the connections
//            }
            return "WRITE CODE FOR ASYNC";
        }
    }

//    @Override
//    protected void onPostExecute(ArrayList<Question> questions) {
//        super.onPostExecute(questions);
//        //Log.d("demo", questions.toString());
//
//        //Using interface to send the ArrayList to Main Activity
//        iData.sendQuestions(questions);
//        iData.finished(true);
//    }
}
