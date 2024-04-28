// register.js
import axios from 'axios';

export const register = async (userData) => {
    try {
        // używając biblioteki axios napisz zapytanie POST na odpowiedni endpoint przesyłający userData

        if (response.status !== 200) {
            throw new Error('Registration failed');
        }

        return response.data;
    } catch (error) {
        throw new Error(error.message);
    }
};
