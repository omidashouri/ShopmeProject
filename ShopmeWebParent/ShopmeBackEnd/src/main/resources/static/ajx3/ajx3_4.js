(function() {
  const cityName = 'Tehran';
  const key = '079d7d2a966051f468b6f8b9e97a0480';
  const url = 'https://api.openweathermap.org/data/2.5/weather?q='+cityName+'&appid='+key;

  getWeatherData();
  function getWeatherData(){
      const xhr = new XMLHttpRequest();
      xhr.onreadystatechange = function() {
          if(xhr.readyState === 4){
              const data = JSON.parse(xhr.responseText);
              console.log(data);
              console.log(data.name);
              console.log(data.weather[0].description);
          const  div = document.createElement('div');
          div.textContent = `${data.name} ${data.weather[0].description}`;
          document.body.append(div);
          }
      }
      xhr.open('GET', url, true);
      xhr.send();
  }


})();