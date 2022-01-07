import './App.css';
import React, { useState, useEffect } from 'react';
import Axios from 'axios';
//import { response } from 'express';

function App() {

    const [message, setMessage] = useState('')
    const [messageList, setMessageList] = useState([])

    useEffect( () => {
      Axios.get('http://localhost:3001/api/get').then ((response) => {
        setMessageList (response.data)
      });
    }, [] )
    const submitForm = () => {
      Axios.post('http://localhost:3001/api/insert',
      { message: message } );
      setMessageList([...messageList, { message: message }])
    } 
    return (
    <div className="App">
      <h1>MESSAGE APP</h1>
      <input type="text" name="message" onChange={ (e) => {
        setMessage (e.target.value);
      }} />
      <br />
      <br />
      <button onClick={submitForm}> Send </button>
      {messageList.map((val) => {
        return <h1> {val.message} </h1>
      })}
    </div>
  );
}

export default App;
