import React from 'react';
import ReactDOM from 'react-dom';
import './webapp/index.css';
import App from './webapp/App';
import registerServiceWorker from './webapp/registerServiceWorker';

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();
