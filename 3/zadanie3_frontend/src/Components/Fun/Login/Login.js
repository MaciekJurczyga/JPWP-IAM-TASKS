// login.js
import axios from 'axios';

export const login = async (userData) => {
    try {
        //wzorując się na poprzednim zadaniu napisz zapytanie post na odpowiedni endpoint


        if (response.status === 200) {
            alert('Zalogowano!');
        }

        return response.data;
    } catch (error) {
        throw new Error(error.message);
    }
};
