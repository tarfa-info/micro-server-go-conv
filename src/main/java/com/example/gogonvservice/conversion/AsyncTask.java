package com.example.gogonvservice.conversion;

public class AsyncTask  extends Thread{

    public void onPreExecute(){

    }

    public void onPostExecute() {

        if (this.getState()!= State.TERMINATED) {

        }

    }

    public void doInBackGround() {

    }

    @Override
    public void run() {

    }

}

// todo the Thread inform the other i have finished
