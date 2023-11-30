import { View, Text, Button } from 'react-native';
import { NativeModules } from 'react-native';
const { MyToastModule, WindowManagerModule } = NativeModules;
const LoginPage = () => {
    return (
        <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
            <Text style={{color: 'red'}}>4444</Text>
            <Button title='rrrr' onPress={()=>{
                // MyToastModule.showToast('Hello from React Native!');
                WindowManagerModule.showOverlay();
            }} />

        </View>
    )
}
export default LoginPage;