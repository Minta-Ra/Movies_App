import {React, useState, useEffect} from 'react';
import { StatusBar } from 'expo-status-bar';
import { SafeAreaView, StyleSheet, Text, View, ScrollView} from 'react-native';
import { getPopularMovies, getTopRatedMovies, getUpcomingMovies } from '../services/MovieApiServices';
import MovieList from '../components/MovieList';


const HomeScreenList = ({}) => {

    const [popularMovies, setPopularMovies] = useState([]);
    const [topRatedMovies, setTopRatedMovies] = useState([]);
    const [upcomingMovies, setUpcomingMovies] = useState([]);
  
    useEffect(() => {
      getPopularMovies().then((popularMovies) => {
        setPopularMovies(popularMovies.results);
      });
      
    },[])
  
    useEffect(() => {
      getTopRatedMovies().then((topRatedMovies) => {
        setTopRatedMovies(topRatedMovies.results);
      });
      
    },[])
  
    useEffect(() => {
      getUpcomingMovies().then((upcomingMovies) => {
        setUpcomingMovies(upcomingMovies.results);
      });
      
    },[])
    
    
    
  
    return (
      <SafeAreaView style={styles.container}>
      <ScrollView >  
        <View >
       <Text style={{ color:"#f5c517", paddingLeft:10, fontWeight:"bold" }}>Popular Movies</Text>
        <MovieList movies={popularMovies} ></MovieList>
        </View>
        <View>
        <Text style={{ color:"#f5c517", paddingLeft:10, fontWeight:"bold" }}>Top Rated Movies</Text>
        <MovieList movies={topRatedMovies}></MovieList>
        </View>
        <View>
        <Text style={{ color:"#f5c517", paddingLeft:10, fontWeight:"bold" }}> Upcoming Movies</Text>
        <MovieList movies={upcomingMovies}></MovieList>
        </View>
        </ScrollView>
      
        <StatusBar style="auto" />
      </SafeAreaView>
    );
    
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      alignItems: 'center',
      justifyContent: 'center',
     
    }
  });

export default HomeScreenList