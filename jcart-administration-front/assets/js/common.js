axios.defaults.baseURL = 'http://localhost:8080';
axios.defaults.headers.post['Content-Type'] = 'application/json';
axios.defaults.headers.common['jcartToken'] = localStorage['jcartToken'];