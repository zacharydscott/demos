import * as React from 'react';

interface IProps {
  increment: (value: number) => void;
  value: number;
  name: string;
}
export const ClickerIncrementer: React.StatelessComponent<IProps> = (props) => {

  return (
    <button 
          className="btn btn-primary"
          onClick={() => {props.increment(props.value)}}
          >{props.name}</button>
  )

}
